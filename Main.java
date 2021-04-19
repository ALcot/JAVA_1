class Main {
  public static void main(String[] args) {
    // 変数languagesを定義し、配列を代入する
    String[] languages={"Ruby", "PHP", "Python"};
    
    // インデックス番号が「1」の要素を出力する
    System.out.println(languages[1]);
    
    // インデックス番号が「1」の要素を「Java」で上書きする
    languages[1]="Java";
    
    // インデックス番号が「1」の要素を出力して変更の確認をする
    System.out.println(languages[1]);
    
  }
}