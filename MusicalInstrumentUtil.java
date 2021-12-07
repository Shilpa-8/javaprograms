class MusicalInstrumentUtil{



public static void main(String a[]){

 MusicalInstrument music=new MusicalInstrument();
 music.name="Guitar";
 music.price=4000.50;
 music.frequency="20hz";
 music.type="Western";
 music.displayMusicalInstruments();
 music.play(music.name);

}


}