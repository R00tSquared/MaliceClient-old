
public class TextureAnimating {

	private static final int[] Animated_Textures = { 17, 24, 34, 40, 1};
	
	private static byte[] pixels = new byte[16384];
	private static int[] hdPixels = new int[16384];
	
	/**
	 * Animates on screen textures with a certain id.
	 */
	public static void animateTexture() {
		try {
		if (!Rasterizer.lowMem) {
			for(int tex : Animated_Textures ) {
					Texture t = Texture.get(tex);
					if(t instanceof RGBTexture) {
						RGBTexture rgbT = (RGBTexture)t;
						int indexes = rgbT.width * rgbT.height - 1;
						int noise = rgbT.width * Client.anInt945 * 2;
						int current[] = rgbT.pixels;
						int next[] = hdPixels;
						for (int i2 = 0; i2 <= indexes; i2++)
							next[i2] = current[i2 - noise & indexes];
	
						rgbT.setPixels(next);
						hdPixels = current;
						Rasterizer.resetTexture(tex);
					} else
					if(t instanceof ARGBTexture) {
						ARGBTexture rgbT = (ARGBTexture)t;
						int indexes = rgbT.width * rgbT.height - 1;
						int noise = rgbT.width * Client.anInt945 * 2;
						int current[] = rgbT.pixels;
						int next[] = hdPixels;
						for (int i2 = 0; i2 <= indexes; i2++)
							next[i2] = current[i2 - noise & indexes];
	
						rgbT.setPixels(next);
						hdPixels = current;
						Rasterizer.resetTexture(tex);
					} else
					if(t instanceof PalettedTexture || t instanceof AlphaPalettedTexture) {
						PalettedTexture rgbT = (PalettedTexture)t;
						int indexes = rgbT.width * rgbT.height - 1;
						int noise = rgbT.width * Client.anInt945 * 2;
						byte current[] = rgbT.getIndices();
						byte next[] = pixels;
						for (int i2 = 0; i2 <= indexes; i2++)
							next[i2] = current[i2 - noise & indexes];
	
						rgbT.setIndices(next);
						pixels = current;
						Rasterizer.resetTexture(tex);
					}
			}
		}
		} catch (Exception e) {
		}
	}
}
