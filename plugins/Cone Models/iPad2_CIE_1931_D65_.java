// Code automatically generated by 'Generate Cone Mapping Model' script by Jolyon Troscianko

//Model fits:
//X 0.9744139746985522
//Y 0.9825421078266868
//Z 0.9890990296462


// Generated: 2018/10/1   15:21:10


import ij.*;
import ij.plugin.filter.PlugInFilter;
import ij.process.*;

public class iPad2_CIE_1931_D65_ implements PlugInFilter {

ImageStack stack;
	public int setup(String arg, ImagePlus imp) { 
	stack = imp.getStack(); 
	return DOES_32 + STACK_REQUIRED; 
	}
public void run(ImageProcessor ip) {

IJ.showStatus("Cone Mapping");
float[] visR;
float[] visG;
float[] visB;
int w = stack.getWidth();
int h = stack.getHeight();
int dimension = w*h;

float[] X = new float[dimension];
float[] Y = new float[dimension];
float[] Z = new float[dimension];

visR = (float[]) stack.getPixels(1);
visG = (float[]) stack.getPixels(2);
visB = (float[]) stack.getPixels(3);

for (int i=0;i<dimension;i++) {
X[i] = (float) (0.003468552886388985 +(visR[i]*0.0026067973080984774)+(visG[i]*0.006261697856858628)+(visB[i]*0.003791003528545326)+(visR[i]*visG[i]*-2.7232746903175104E-5)+(visR[i]*visB[i]*6.15827605368172E-5)+(visG[i]*visB[i]*-6.784532291013254E-5));
Y[i] = (float) (-0.026367958720407154 +(visR[i]*0.0016551708419512764)+(visG[i]*0.009554271069170868)+(visB[i]*0.0033277861791342783)+(visR[i]*visG[i]*-2.8000324753223258E-5)+(visR[i]*visB[i]*2.6008025298345998E-5)+(visG[i]*visB[i]*-5.1622944888922545E-5));
Z[i] = (float) (-0.01886227985652185 +(visR[i]*-5.412216631930552E-4)+(visG[i]*0.0014541660274020652)+(visB[i]*0.0125689343159621)+(visR[i]*visG[i]*-1.452703041266593E-6)+(visR[i]*visB[i]*3.578731836722691E-5)+(visG[i]*visB[i]*-7.458711778132351E-5));
IJ.showProgress((float) i/dimension);
}

ImageStack outStack = new ImageStack(w, h);
outStack.addSlice("X", X);
outStack.addSlice("Y", Y);
outStack.addSlice("Z", Z);
new ImagePlus("Output", outStack).show();

}
}