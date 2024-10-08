package es.in2.remotesignature.vault.adapter.hashicorp.config;

import es.in2.remotesignature.configuration.service.GenericConfigAdapter;
import es.in2.remotesignature.configuration.util.ConfigAdapterFactory;
import es.in2.remotesignature.vault.adapter.hashicorp.config.properties.HashicorpProperties;
import es.in2.remotesignature.vault.model.provider.VaultProviderEnum;
import es.in2.remotesignature.vault.util.VaultProviderAnnotation;
import org.springframework.stereotype.Component;

@Component
@VaultProviderAnnotation(provider = VaultProviderEnum.HASHICORP)
public class HashicorpConfig {
    private final GenericConfigAdapter genericConfigAdapter;
    private final HashicorpProperties hashicorpProperties;

    public HashicorpConfig(ConfigAdapterFactory configAdapterFactory, HashicorpProperties hashicorpProperties) {
        this.genericConfigAdapter = configAdapterFactory.getAdapter();
        this.hashicorpProperties = hashicorpProperties;
    }


    public String getSecretPath() {
        return genericConfigAdapter.getConfiguration(hashicorpProperties.path());
    }

    public String getVaultHost() {
        return genericConfigAdapter.getConfiguration(hashicorpProperties.host());
    }

    public int getVaultPort() {
        return Integer.parseInt(genericConfigAdapter.getConfiguration(hashicorpProperties.port()));
    }

    public String getVaultScheme() {
        return genericConfigAdapter.getConfiguration(hashicorpProperties.scheme());
    }

    public String getVaultToken() {
        return genericConfigAdapter.getConfiguration(hashicorpProperties.token());
    }
}
