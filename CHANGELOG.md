# CamoEvo_Release_V1.21
Updated Version of CamoEvo

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	CamoEvo
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

   Fixes

-	Analysis Plots, updated the error bars to use the standard error for the generation.
-	GabRat now works with square shaped targets for image analysis, note (does not fix the issue for RAW GabRat).
-	ColourRange no longer produces NaNs if the range=0.
-	TriangleShape now uses the correct setting.
-	Distribution fixed the default gene distribution to be uniform.
-	Built in Games made it so the built in games have all the Population_Settings
-	GA interface fixed error with GA best clone entry
-	Rank CamoEvo no longer defaults the fitness value to rank

   Additions

-	Repeats, CamoEvo can now function with repeats for each target.

-	PepMoth, new starting default showcasing the new transform features and the Gaussian starting population.

-	Shapes, added a egg clutch and a square shape to the defaults.

-	Transform Phenotypic Ranges similar to specifying the colour ranges you can now reduce the phenotypic ranges of genes. E.g. making it so 0.0-1.0, is instead expressed as 0.2-0.4 or 0.5-1.0 etc. To make the transform.txt files copy the gene template and replace the second row with the Min values and the third row with the Max values, leaving the title unaltered. “Transform_PhenotypeRanges.txt”

-	Transform Starting Gene Ranges similar to specifying the colour ranges you can now specify the starting ranges for all of the genes. To make the transform.txt files copy the gene template and replace the second row with the Min values and the third row with the Max values, leaving the title unaltered. “Transform_StarGeneRanges.txt”

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	ImageGA
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
   
   Additions

-	Average Repeats, If there are multiples of the same target ID, ImageGA will average the fitness values


|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	Psychophysics Game
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

   Additions

-	Improved Spawning, targets now spawn using exclusion based system, preventing targets from overlapping
-	Mouse Click, can no longer just hold the mouse down.
-	N misses, can now set the number of misses (miss.N), where N = number of misses (1 = 1 click)


|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	Image Analysis
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

   Additions

-	Batch Measure now separated into measurement macros. These are run by using the 0 Batch Measure Population Macro. First select a population, then select a measure from the table. The analysis in the UI now uses the LAB measure and imports the data to reconstruct the plots.
	All data is outputted in a Data_Measures_[PopName].txt file.
 	If you want to run additional analyses you will need to rename or remove. The existing files.

-	ImageAnalysis Folder. The image analysis scripts have been moved to a new folder in 2 Camo Req.

-	Measure Macros New measurement scrips.
	o	Revised LAB measure
	o	New XYZ measure, the same as the LAB  measure but with the XYZ space
	o	New RNL local measure, the RNL chromaticity similarity.



|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	Pattern Generation
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

   Fixes

-	Animal Patterns fixed issue with incorrect thresholding of patterns.

   Additions

-	Experimental Egg V2. A slower but more effective egg pattern generator
	o	Both maculations can have all the same genes, median and randomwalk
	o	Added new background speckling 
	o	Improved the pore texture
	o	Introduced a wave form to the colour space, cuasing saturation to peak then drop with deposition. (Creates more natural looking eggs).
	o	New clutch feature, if the target shape has multiple objects, it’ll instead produce a radial pattern.







-	

