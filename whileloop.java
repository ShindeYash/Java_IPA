public class whileloop
{   public static void main(String[] args){
    int i = 0;
    while(i < 10){
        i++;
        if(i == 3){
            continue;
        }
        System.out.println(i);
        if(i == 5){
            break;
        }
    }
}
}
