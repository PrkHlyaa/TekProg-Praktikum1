public class KeyboardAdapter implements KeyboardInput {
    private final WASDInput wasdInput;
    private final IJKLInput ijklInput;

    public KeyboardAdapter(WASDInput wasdInput, IJKLInput ijklInput) {
        this.wasdInput = wasdInput;
        this.ijklInput = ijklInput;
    }

    @Override
    public boolean isKeyDown(char key) {
        return wasdInput.isKeyDown(key) || ijklInput.isKeyDown(key);
    }

    @Override
    public void setKeyDown(char key, boolean down) {
        wasdInput.setKeyDown(key, down);
        ijklInput.setKeyDown(key, down);
    }
}
