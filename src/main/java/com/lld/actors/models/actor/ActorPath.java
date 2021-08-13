package com.lld.actors.models.actor;

public interface ActorPath {
  public String getPath();
  public ActorPath fromString(String path);
  public boolean validatePath(String element);
  public boolean validatePathElement(String element, String fullPath);
}
