public class LisaTuuletin implements ILaiteosa {
    private int hinta = 10;

    @Override
    public int naytaHinta() {
        // TODO Auto-generated method stub
        return hinta;
    }

    @Override
    public void lisaaOsa(ILaiteosa laiteosa) {
        throw new RuntimeException("Peruskomponenttiin ei voi lisätä osaa");        
    }
    
}
