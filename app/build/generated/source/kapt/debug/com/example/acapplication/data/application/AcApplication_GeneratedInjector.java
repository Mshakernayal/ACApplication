package com.example.acapplication.data.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = AcApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface AcApplication_GeneratedInjector {
  void injectAcApplication(AcApplication acApplication);
}
