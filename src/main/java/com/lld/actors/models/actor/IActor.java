package com.lld.actors.models.actor;

public interface IActor<T> {
  void receive(Message message);
}
