public class WASDInput implements KeyboardInput {
    private boolean wKeyDown;
    private boolean aKeyDown;
    private boolean sKeyDown;
    private boolean dKeyDown;

    @Override
    public boolean isKeyDown(char key) {
        switch (key) {
            case 'W':
                return wKeyDown;
            case 'A':
                return aKeyDown;
            case 'S':
                return sKeyDown;
            case 'D':
                return dKeyDown;
            default:
                return false;
        }
    }

    @Override
    public void setKeyDown(char key, boolean down) {
        switch (key) {
            case 'W':
                wKeyDown = down;
                break;
            case 'A':
                aKeyDown = down;
                break;
            case 'S':
                sKeyDown = down;
                break;
            case 'D':
                dKeyDown = down;
                break;
        }
    }
}
