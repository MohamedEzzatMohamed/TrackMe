package com.example.track_me;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = TrackMeApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface TrackMeApplication_GeneratedInjector {
  void injectTrackMeApplication(TrackMeApplication trackMeApplication);
}
