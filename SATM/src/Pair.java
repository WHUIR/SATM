
public class Pair<K, V> {
  public K v1;
  public V v2;
  
  public Pair(K v1, V v2){
    this.v1 = v1;
    this.v2 = v2;
  }
  
  public K getV1(){
    return this.v1;
  }
  
  public V getV2(){
    return this.v2;
  }
  
  public void setV1(K v1){
    this.v1 = v1;
  }
  
  public void setV2(V v2){
    this.v2 = v2;
  }
}
