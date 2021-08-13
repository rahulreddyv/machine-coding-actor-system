package com.lld.actors.models;

import java.util.concurrent.atomic.AtomicInteger;

public class ActorSystem implements IActorSystem {

    @Override
    public CompletableFuture<IActor> createActor(ActorProps props) {
      int currentId = id.incrementAndGet();
    }

    @Override
    public IActor getActor(ActorPath path) {
      // TODO
    }
}

/**
 * 1. Synchronized - only use incase of updating the or instance variable
 * 2. AtomicInteger/AtomicRef - use it if you want to update instance variable safely
 * 3. DONOT use any instance variables
 * 4. Completable Futures
 */