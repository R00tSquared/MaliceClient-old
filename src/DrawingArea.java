// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class DrawingArea extends NodeSub {

	public static void initDrawingArea(int i, int j, int ai[])
	{
		pixels = ai;
		width = j;
		height = i;
		setDrawingArea(i, 0, j, 0);
	}

	public static void defaultDrawingAreaSize()
	{
			topX = 0;
			topY = 0;
			bottomX = width;
			bottomY = height;
			centerX = bottomX;
			centerY = bottomX / 2;
	}
	
	public static void drawAlphaGradient(int x, int y, int gradientWidth,
			int gradientHeight, int startColor, int endColor, int alpha) {
		int k1 = 0;
		int l1 = 0x10000 / gradientHeight;
		if (x < topX) {
			gradientWidth -= topX - x;
			x = topX;
		}
		if (y < topY) {
			k1 += (topY - y) * l1;
			gradientHeight -= topY - y;
			y = topY;
		}
		if (x + gradientWidth > bottomX)
			gradientWidth = bottomX - x;
		if (y + gradientHeight > bottomY)
			gradientHeight = bottomY - y;
		int i2 = width - gradientWidth;
		int result_alpha = 256 - alpha;
		int total_pixels = x + y * width;
		for (int k2 = -gradientHeight; k2 < 0; k2++) {
			int gradient1 = 0x10000 - k1 >> 8;
			int gradient2 = k1 >> 8;
			int gradient_color = ((startColor & 0xff00ff) * gradient1
					+ (endColor & 0xff00ff) * gradient2 & 0xff00ff00)
					+ ((startColor & 0xff00) * gradient1 + (endColor & 0xff00)
							* gradient2 & 0xff0000) >>> 8;
			int color = ((gradient_color & 0xff00ff) * alpha >> 8 & 0xff00ff)
					+ ((gradient_color & 0xff00) * alpha >> 8 & 0xff00);
			for (int k3 = -gradientWidth; k3 < 0; k3++) {
				int colored_pixel = pixels[total_pixels];
				colored_pixel = ((colored_pixel & 0xff00ff) * result_alpha >> 8 & 0xff00ff)
						+ ((colored_pixel & 0xff00) * result_alpha >> 8 & 0xff00);
				pixels[total_pixels++] = color + colored_pixel;
			}
			total_pixels += i2;
			k1 += l1;
		}
	}

    public static void method336(int i, int j, int k, int l, int i1)
    {
        if(k < topX)
        {
            i1 -= topX - k;
            k = topX;
        }
        if(j < topY)
        {
            i -= topY - j;
            j = topY;
        }
        if(k + i1 > bottomX)
            i1 = bottomX - k;
        if(j + i > bottomY)
            i = bottomY - j;
        int k1 = width - i1;
        int l1 = k + j * width;
        for(int i2 = -i; i2 < 0; i2++)
        {
            for(int j2 = -i1; j2 < 0; j2++)
                pixels[l1++] = l;

            l1 += k1;
        }

    }

	public static void drawPixelsWithOpacity(int color, int yPos, int pixelWidth, int pixelHeight, int opacityLevel, int xPos) {//method335
		if(xPos < topX) {
			pixelWidth -= topX - xPos;
			xPos = topX;
		}
		if(yPos < topY) {
			pixelHeight -= topY - yPos;
			yPos = topY;
		}
		if(xPos + pixelWidth > bottomX)
			pixelWidth = bottomX - xPos;
		if(yPos + pixelHeight > bottomY)
			pixelHeight = bottomY - yPos;
		int l1 = 256 - opacityLevel;
		int i2 = (color >> 16 & 0xff) * opacityLevel;
		int j2 = (color >> 8 & 0xff) * opacityLevel;
		int k2 = (color & 0xff) * opacityLevel;
		int k3 = width - pixelWidth;
		int l3 = xPos + yPos * width;
		for(int i4 = 0; i4 < pixelHeight; i4++) {
			for(int j4 = -pixelWidth; j4 < 0; j4++) {
				int l2 = (pixels[l3] >> 16 & 0xff) * l1;
				int i3 = (pixels[l3] >> 8 & 0xff) * l1;
				int j3 = (pixels[l3] & 0xff) * l1;
				int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
				pixels[l3++] = k4;
			}
			l3 += k3;
		}
	}

	public static void drawHorizontalLine(int yPos, int lineColor, int lineWidth, int xPos) {//method339
		if(yPos < topY || yPos >= bottomY)
			return;
		if(xPos < topX) {
			lineWidth -= topX - xPos;
			xPos = topX;
		}
		if(xPos + lineWidth > bottomX)
			lineWidth = bottomX - xPos;
		int i1 = xPos + yPos * width;
		for(int j1 = 0; j1 < lineWidth; j1++)
			pixels[i1 + j1] = lineColor;
	}

	public static void drawVerticalLine(int yPos, int lineColor, int lineHeight, int xPos) {//method341
		if(xPos < topX || xPos >= bottomX)
			return;
		if(yPos < topY) {
			lineHeight -= topY - yPos;
			yPos = topY;
		}
		if(yPos + lineHeight > bottomY)
			lineHeight = bottomY - yPos;
		int j1 = xPos + yPos * width;
		for(int k1 = 0; k1 < lineHeight; k1++)
			pixels[j1 + k1 * width] = lineColor;
	}
	

	public static void drawHorizontalLineWithOpacity(int lineColor, int lineWidth, int yPos, int opacityLevel, int xPos) {//method340
		if(yPos < topY || yPos >= bottomY)
			return;
		if(xPos < topX) {
			lineWidth -= topX - xPos;
			xPos = topX;
		}
		if(xPos + lineWidth > bottomX)
			lineWidth = bottomX - xPos;
		int j1 = 256 - opacityLevel;
		int k1 = (lineColor >> 16 & 0xff) * opacityLevel;
		int l1 = (lineColor >> 8 & 0xff) * opacityLevel;
		int i2 = (lineColor & 0xff) * opacityLevel;
		int i3 = xPos + yPos * width;
		for(int j3 = 0; j3 < lineWidth; j3++) {
			int j2 = (pixels[i3] >> 16 & 0xff) * j1;
			int k2 = (pixels[i3] >> 8 & 0xff) * j1;
			int l2 = (pixels[i3] & 0xff) * j1;
			int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
			pixels[i3++] = k3;
		}
	}
	
	public static void drawUnfilledPixels(int xPos, int pixelWidth, int pixelHeight, int color, int yPos) {//method337
		drawHorizontalLine(yPos, color, pixelWidth, xPos);
		drawHorizontalLine((yPos + pixelHeight) - 1, color, pixelWidth, xPos);
		drawVerticalLine(yPos, color, pixelHeight, xPos);
		drawVerticalLine(yPos, color, pixelHeight, (xPos + pixelWidth) - 1);
	}

	public static void setDrawingArea(int i, int j, int k, int l)
	{
		if(j < 0)
			j = 0;
		if(l < 0)
			l = 0;
		if(k > width)
			k = width;
		if(i > height)
			i = height;
		topX = j;
		topY = l;
		bottomX = k;
		bottomY = i;
		centerX = bottomX;
		centerY = bottomX / 2;
		anInt1387 = bottomY / 2;
	}

	public static void setAllPixelsToZero()
	{
		int i = width * height;
		for(int j = 0; j < i; j++)
			pixels[j] = 0;

	}

	public static void method335(int i, int j, int k, int l, int i1, int k1)
	{
		if(k1 < topX)
		{
			k -= topX - k1;
			k1 = topX;
		}
		if(j < topY)
		{
			l -= topY - j;
			j = topY;
		}
		if(k1 + k > bottomX)
			k = bottomX - k1;
		if(j + l > bottomY)
			l = bottomY - j;
		int l1 = 256 - i1;
		int i2 = (i >> 16 & 0xff) * i1;
		int j2 = (i >> 8 & 0xff) * i1;
		int k2 = (i & 0xff) * i1;
		int k3 = width - k;
		int l3 = k1 + j * width;
		for(int i4 = 0; i4 < l; i4++)
		{
			for(int j4 = -k; j4 < 0; j4++)
			{
				int l2 = (pixels[l3] >> 16 & 0xff) * l1;
				int i3 = (pixels[l3] >> 8 & 0xff) * l1;
				int j3 = (pixels[l3] & 0xff) * l1;
				int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
				pixels[l3++] = k4;
			}

			l3 += k3;
		}
	}
	//int i, int y, int x, int color, int width
	public static void drawPixels(int i, int j, int k, int l, int i1)
	{
		if(k < topX)
		{
			i1 -= topX - k;
			k = topX;
		}
		if(j < topY)
		{
			i -= topY - j;
			j = topY;
		}
		if(k + i1 > bottomX)
			i1 = bottomX - k;
		if(j + i > bottomY)
			i = bottomY - j;
		int k1 = width - i1;
		int l1 = k + j * width;
		for(int i2 = -i; i2 < 0; i2++)
		{
			for(int j2 = -i1; j2 < 0; j2++)
				pixels[l1++] = l;

			l1 += k1;
		}

	}

	public static void fillPixels(int i, int j, int k, int l, int i1)
	{
		method339(i1, l, j, i);
		method339((i1 + k) - 1, l, j, i);
		method341(i1, l, k, i);
		method341(i1, l, k, (i + j) - 1);
	}

	public static void method338(int i, int j, int k, int l, int i1, int j1)
	{
		method340(l, i1, i, k, j1);
		method340(l, i1, (i + j) - 1, k, j1);
		if(j >= 3)
		{
			method342(l, j1, k, i + 1, j - 2);
			method342(l, (j1 + i1) - 1, k, i + 1, j - 2);
		}
	}

	public static void method339(int i, int j, int k, int l)
	{
		if(i < topY || i >= bottomY)
			return;
		if(l < topX)
		{
			k -= topX - l;
			l = topX;
		}
		if(l + k > bottomX)
			k = bottomX - l;
		int i1 = l + i * width;
		for(int j1 = 0; j1 < k; j1++)
			pixels[i1 + j1] = j;

	}

	private static void method340(int i, int j, int k, int l, int i1)
	{
		if(k < topY || k >= bottomY)
			return;
		if(i1 < topX)
		{
			j -= topX - i1;
			i1 = topX;
		}
		if(i1 + j > bottomX)
			j = bottomX - i1;
		int j1 = 256 - l;
		int k1 = (i >> 16 & 0xff) * l;
		int l1 = (i >> 8 & 0xff) * l;
		int i2 = (i & 0xff) * l;
		int i3 = i1 + k * width;
		for(int j3 = 0; j3 < j; j3++)
		{
			int j2 = (pixels[i3] >> 16 & 0xff) * j1;
			int k2 = (pixels[i3] >> 8 & 0xff) * j1;
			int l2 = (pixels[i3] & 0xff) * j1;
			int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
			pixels[i3++] = k3;
		}

	}

	public static void method341(int i, int j, int k, int l)
	{
		if(l < topX || l >= bottomX)
			return;
		if(i < topY)
		{
			k -= topY - i;
			i = topY;
		}
		if(i + k > bottomY)
			k = bottomY - i;
		int j1 = l + i * width;
		for(int k1 = 0; k1 < k; k1++)
			pixels[j1 + k1 * width] = j;

	}

	private static void method342(int i, int j, int k, int l, int i1) {
		if(j < topX || j >= bottomX)
			return;
		if(l < topY) {
			i1 -= topY - l;
			l = topY;
		}
		if(l + i1 > bottomY)
			i1 = bottomY - l;
		int j1 = 256 - k;
		int k1 = (i >> 16 & 0xff) * k;
		int l1 = (i >> 8 & 0xff) * k;
		int i2 = (i & 0xff) * k;
		int i3 = j + l * width;
		for(int j3 = 0; j3 < i1; j3++) {
			int j2 = (pixels[i3] >> 16 & 0xff) * j1;
			int k2 = (pixels[i3] >> 8 & 0xff) * j1;
			int l2 = (pixels[i3] & 0xff) * j1;
			int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
			pixels[i3] = k3;
			i3 += width;
		}
	}

	DrawingArea() {}

	public static int pixels[];
	public static int width;
	public static int height;
	public static int topY;
	public static int bottomY;
	public static int topX;
	public static int bottomX;
	public static int centerX;
	public static int centerY;
	public static int anInt1387;

}
