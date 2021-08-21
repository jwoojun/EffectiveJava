package com.example.effectivejava.chapter07.item43;

class Main {
  public static void main(String[] args) {

    Service service = new Service();
    service.execute(GoshThisClassNameIsHumongous::action);
    service.execute(() -> GoshThisClassNameIsHumongous.action());
    service.execute(
        new ServiceExecutor() {
          @Override
          public void action() {
            System.out.println("annoy action!");
          }
        });
  }
}

class Service {
  public void execute(ServiceExecutor serviceExecutor) {
    serviceExecutor.action();
  }
}

interface ServiceExecutor {
  void action();
}

class GoshThisClassNameIsHumongous {
  public static void action() {
    System.out.println("action!");
  }
}
