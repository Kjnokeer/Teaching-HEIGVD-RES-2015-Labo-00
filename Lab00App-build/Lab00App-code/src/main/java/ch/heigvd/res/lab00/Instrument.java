package ch.heigvd.res.lab00;

/**
 *
 * @author Mathias
 */
public abstract class Instrument implements IInstrument {
   
   private String sound;
   private int volume;
   private String color;

   public Instrument(String sound, int volume, String color) {
      this.sound = sound;
      this.volume = volume;
      this.color = color;
   }

   @Override
   public String play() {
      return sound;
   }

   @Override
   public int getSoundVolume() {
      return volume;
   }

   @Override
   public String getColor() {
      return color;
   }
   
}
