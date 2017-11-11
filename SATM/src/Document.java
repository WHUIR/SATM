
public class Document {
  
  public String [] words;
  public int id;
  public String category;
  
  
  public Document(int docid, String category, String [] words){
    this.id = docid;
    this.category = category;
    this.words = words;
  }

  public static void main(String[] args) {
    // TODO 自动生成的方法存根
    String [] sarray = {"科技","专科","西安","大学"};
    Document doc = new Document(1, "院校信息", sarray);
    System.out.println(doc.id);
  }
}
