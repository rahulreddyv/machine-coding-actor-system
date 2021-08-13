package com.lld.actors.models.actor;

public class ActorProps {
  private IActor actor;
  private String name;

  public ActorProps(IActor actor) {
    this.actor = actor;
  }

  public IActor getActor() {
    return actor;
  }
}
