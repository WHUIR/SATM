
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
    // TODO �Զ����ɵķ������
    String [] sarray = {"�Ƽ�","ר��","����","��ѧ"};
    Document doc = new Document(1, "ԺУ��Ϣ", sarray);
    System.out.println(doc.id);
  }
}
