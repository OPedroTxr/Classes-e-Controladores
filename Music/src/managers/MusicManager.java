package managers;

//imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import classes.Music;
import classes.Music;

public class MusicManager {
    private List<Music> listaDeMusicas;

    public MusicManager() {
        listaDeMusicas = new ArrayList<>();
    }
    
    public int Size(){
        return listaDeMusicas.size();
    }
    
    public void addMusic(){
        Music _music = new Music();
        _music.fill();
        listaDeMusicas.add(_music);
    }
    
    public void removeMusic(String nomeMusica){
        for(int i = 0; i < listaDeMusicas.size(); i++){
            Music _music = listaDeMusicas.get(i);
            if(nomeMusica.equals(_music.getTitle())){
                listaDeMusicas.remove(_music);
            }
        }
    }
    
    public void searchMusic(String nomeMusic){
        for(int i = 0; i < listaDeMusicas.size(); i++){
            Music _music = listaDeMusicas.get(i);
            if(nomeMusic.equals(_music.getTitle())){
                _music.printSummary(i);
            }
        }
    }
    
    public void printAllList(){
        for (int i = 0; i < listaDeMusicas.size(); i ++){
            Music _music = listaDeMusicas.get(i);
            _music.printSummary(i);
        }
    }
}