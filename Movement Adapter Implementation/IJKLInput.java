public class IJKLInput implements KeyboardInput {
    private boolean iKeyDown;
    private boolean jKeyDown;
    private boolean kKeyDown;
    private boolean lKeyDown;

    @Override
    public boolean isKeyDown(char key) {
        switch (key) {
            case 'I':
                return iKeyDown;
            case 'J':
                return jKeyDown;
            case 'K':
                return kKeyDown;
            case 'L':
                return lKeyDown;
            default:
                return false;
        }
    }

    @Override
    public void setKeyDown(char key, boolean down) {
        switch (key) {
            case 'I':
                iKeyDown = down;
                break;
            case 'J':
                jKeyDown = down;
                break;
            case 'K':
                kKeyDown = down;
                break;
            case 'L':
                lKeyDown = down;
                break;
        }
    }
}
