public class Loop {
public static void main(String[] args) {
    // While Loop
    int i = 0;
    while(i < 10){
        i++;
    }

    // For Loop
    for(int j=0;j < 10;j++){

    }

    // break to get out of current loop
    // continue to get next iterate
    for(int j=0;j < 10;j++){
        if (j < 5) {
            continue;
        }else if (j == 5){
            break;
        }
    }

    // Do While Loop
    do { 
        i--;
    } while (i > 0);


}
}
