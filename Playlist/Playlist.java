import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
  //main
  ArrayList<String> desertIslandPlaylist = new ArrayList<String>(); 
  //adds new ArrayList into class
  desertIslandPlaylist.add("Innellea - It's us");
  desertIslandPlaylist.add("Anyma - Running");
  desertIslandPlaylist.add("Anyma - Walking");
  desertIslandPlaylist.add("Sports - Ordinary man");
  desertIslandPlaylist.add("Joshy Soul - Dreams");
  desertIslandPlaylist.add("Mathame - Nothing Around Us");
  desertIslandPlaylist.add("Coeus - Alea");
  //.add adds to the ArrayList

  desertIslandPlaylist.remove("Anyma - Walking");
  desertIslandPlaylist.remove("Joshy Soul - Dreams");
  //.remove removes from the ArrayList and you can either use Index numbers or String and type the entire String as it is.

//SWAP SONGS
//Get the indices of the songs you want to swap.
int indexA = desertIslandPlaylist.indexOf("Sports - Ordinary man");
int indexB = desertIslandPlaylist.indexOf("Mathame - Nothing Around Us");

//Create a temporary variable to store the value of song a. (We’ll call the songs a and b here.)
  String tempA = "Sports - Ordinary Man";

//Rewrite the value at the index of a to the value of b.
  desertIslandPlaylist.set(indexA, "Mathame - Nothing Around Us");

//Rewrite the value at the index of b to the value of the temporary variable.
  desertIslandPlaylist.set(indexB, tempA);
  
  System.out.println("This is the size of the current playlist:" + desertIslandPlaylist.size() + "\n");
  //prints the size of the Array
  System.out.println(desertIslandPlaylist + "\n");
  //prints whats in the Array

  
  }

}

