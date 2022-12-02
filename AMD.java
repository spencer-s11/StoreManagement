public class AMD extends Processors {

  
public AMD(){
  String model = "null";
  int cores = 0;
  int threads = 0;
  String socket = "null";
  String clockSpeed = "null";
  boolean includedCooler = false;
  double price = 0.0;
  int stock = 0;
}

public AMD(String newModel, int newCores, int newThreads, String newSocket, 
           String newClock, boolean newCooler, double newPrice, int newStock) {
  model = newModel;
  cores = newCores;
  threads = newThreads;
  socket = newSocket;
  clockSpeed = newClock;
  includedCooler = newCooler;
  price = newPrice;
  stock = newStock;
}

  

}