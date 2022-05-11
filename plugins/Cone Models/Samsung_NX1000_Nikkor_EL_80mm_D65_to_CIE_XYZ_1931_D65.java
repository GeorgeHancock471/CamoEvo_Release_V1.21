// Code automatically generated by 'Generate Cone Mapping Model' script by Jolyon Troscianko

//Model fits:
//X 0.9981035122659552
//Y 0.9996255737420832
//Z 0.9990387331965598


// Generated: 2019/2/12   16:8:53


import ij.*;
import ij.plugin.filter.PlugInFilter;
import ij.process.*;

public class Samsung_NX1000_Nikkor_EL_80mm_D65_to_CIE_XYZ_1931_D65 implements PlugInFilter {

ImageStack stack;
	public int setup(String arg, ImagePlus imp) { 
	stack = imp.getStack(); 
	return DOES_32 + STACK_REQUIRED; 
	}
public void run(ImageProcessor ip) {

IJ.showStatus("Cone Mapping");
float[] vR;
float[] vG;
float[] vB;
int w = stack.getWidth();
int h = stack.getHeight();
int dimension = w*h;

float[] X = new float[dimension];
float[] Y = new float[dimension];
float[] Z = new float[dimension];

vR = (float[]) stack.getPixels(1);
vG = (float[]) stack.getPixels(2);
vB = (float[]) stack.getPixels(3);

for (int i=0;i<dimension;i++) {
X[i] = (float) (-6.589079958316142E-5 +(vR[i]*0.0045747834502772745)+(vG[i]*0.0056949597890580276)+(vB[i]*-5.999087154520935E-4)+(vR[i]*vG[i]*-1.0288245283146047E-5)+(vR[i]*vB[i]*8.897513785026356E-6)+(vG[i]*vB[i]*4.417281752413403E-6));
Y[i] = (float) (7.630251174182058E-4 +(vR[i]*8.390808568150237E-4)+(vG[i]*0.011367614771264498)+(vB[i]*-0.0023708283514271484)+(vR[i]*vG[i]*-3.765004932619795E-6)+(vR[i]*vB[i]*3.7223468009481533E-6)+(vG[i]*vB[i]*1.3315724727619122E-6));
Z[i] = (float) (0.003059367034897559 +(vR[i]*-1.0527536416354749E-4)+(vG[i]*-0.0036202725180902737)+(vB[i]*0.013498512765939559)+(vR[i]*vG[i]*-3.044169315216908E-7)+(vR[i]*vB[i]*6.289942397173469E-7)+(vG[i]*vB[i]*8.769255260027656E-7));
IJ.showProgress((float) i/dimension);
}

ImageStack outStack = new ImageStack(w, h);
outStack.addSlice("X", X);
outStack.addSlice("Y", Y);
outStack.addSlice("Z", Z);
new ImagePlus("Output", outStack).show();

}
}