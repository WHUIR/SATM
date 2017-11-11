

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;



public class Main {
  
  public static ArrayList<Document> LoadCorpus(String filename){
    try{
      FileInputStream fis = new FileInputStream(filename);
      InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
      BufferedReader reader = new BufferedReader(isr);
      String line;
      ArrayList<Document> doc_list = new ArrayList<Document>();
      while((line = reader.readLine()) != null){
        line = line.trim();
        String[] items = line.split("\t");
        int docid = Integer.parseInt(items[0]);
        String[] others = items[1].split("\\|");
        String category = others[0];
        String words_str = others[1].trim();
        String[] words = words_str.split("\\s");
        Document doc = new Document(docid, category, words);
        doc_list.add(doc);
      }
      return doc_list;
    }
    catch (Exception e){
      System.out.println("Error while reading other file:" + e.getMessage());
      e.printStackTrace();
//      return false;
  }
    return null;
    
  }
  
  
  public static void main(String[] args) {

    ArrayList<Document> doc_list = LoadCorpus("baiduQA.txt");
    int num_topic = 60; 
//    int num_longdoc = 500;
    int num_iter = 1000, save_step = 200;
    double beta=0.1, _threshold=0.001;
    int roundIndex = 0;
    double alpha = 1.0*50/num_topic;
    SATM satm = null;
    for(int num_longdoc=1000;num_longdoc<=1000;num_longdoc+=100){
	    satm = new SATM(doc_list, num_topic, num_longdoc, num_iter, 
	    		save_step, beta, alpha, _threshold, roundIndex=0);
	    satm.run_SATM();
    }
//    for(int num_topic=40;num_topic<=60;num_topic+=20){
//    	double alpha = 1.0*50/num_topic;
//    	satm = new SATM(doc_list, num_topic, num_longdoc, num_iter, 
//	    		save_step, beta, alpha, _threshold, roundIndex=0);
//    	satm.run_SATM();
//    }
  }

}
