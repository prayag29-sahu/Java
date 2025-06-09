
class DownloadFile extends Thread{
    String f;
    public void run(){
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
            System.out.println(f + " downloading... " + (i * 20) + "%");
        }
        System.out.println(f + " Done");
    }

    DownloadFile(String f){
        this.f = f;
    }

    public static void file(String f){
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
            System.out.println(f + " downloading... " + (i * 20) + "%");
        }
        System.out.println("Done");
    }
}

public class LoadingFile {
    public static void main(String[] args) {
        DownloadFile.file("File A");
        DownloadFile.file("File B");
    }
}
