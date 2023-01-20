public class FindRecursive { 
    public static void main(String[] args) { 
        Sentence s = new Sentence("Prog Tech");  
        boolean b = s.find("Te");  
        if (b) 
            System.out.println("Found");   //จากข้อมูลที่กําหนด ผลรันพิมพ์ว่า Found 
        else  //การค้นคําให้เป็นแบบที่ต้องเหมือนกันกับคําที่ต้องการค้นเท่านั้น “te” ถือว่าไม่พบ 
            System.out.println("Not found"); 
    } 
}