package com.myorg;

import software.amazon.awscdk.core.App;

public final class CdkjavarepoApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkjavarepoStack(app, "CdkjavarepoStack");

        app.synth();
    }
}
