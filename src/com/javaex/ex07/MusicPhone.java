package com.javaex.ex07;

public class MusicPhone extends Phone{
    
    public void execute(String str){
        
        if("음악".equals(str)){
            playMusic();
            System.out.println(2);
        }else{
            super.execute(str);
            System.out.println(3);
        }
        
    }
    
    protected void playMusic(){
        System.out.println("Mp3플레이어에서 음악재생");
    }
}
