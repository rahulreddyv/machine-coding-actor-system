package com.lld.actors.models;

import com.lld.actors.models.actor.ActorPath;
import com.lld.actors.models.actor.ActorProps;
import com.lld.actors.models.actor.IActor;

public interface IActorSystem {
  IActor createActor(ActorProps props);
  IActor getActor(ActorPath path);
}
