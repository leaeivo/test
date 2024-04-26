package model;

public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    public void readFiles(int n){
        for (int i = 0; i < n; i++) {
            reader_.readFile();
        }
    }
    public void readString(int n){
        for (int i = 0; i < n; i++) {
            reader_.readString();
        }
    }
}
