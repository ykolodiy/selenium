package imagesPdf;



	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.util.List;

	import javax.imageio.ImageIO;

	import org.apache.pdfbox.pdmodel.PDDocument;
	import org.apache.pdfbox.pdmodel.PDPage;

	@SuppressWarnings("unchecked")
	public class PdftoPng {
	    public static void main(String[] args) {
	        try {
	        String sourceDir = "C:/temp/test2.pdf"; // Pdf files are read from this folder
	        String destinationDir = "C:/temp/converted/"; // converted images from pdf document are saved here

	        File sourceFile = new File(sourceDir);
	        File destinationFile = new File(destinationDir);
	        if (!destinationFile.exists()) {
	            destinationFile.mkdir();
	            System.out.println("Folder Created -> "+ destinationFile.getAbsolutePath());
	        }
	        if (sourceFile.exists()) {
	            System.out.println("Images copied to Folder: "+ destinationFile.getName());             
	            PDDocument document = PDDocument.load(sourceDir);
	            List<PDPage> list = document.getDocumentCatalog().getAllPages();
	            System.out.println("Total files to be converted -> "+ list.size());

	            String fileName = sourceFile.getName().replace(".pdf", "");             
	            int pageNumber = 1;
	            for (PDPage page : list) {
	                BufferedImage image = page.convertToImage();
	                File outputfile = new File(destinationDir + fileName +"_"+ pageNumber +".png");
	                System.out.println("Image Created -> "+ outputfile.getName());
	                ImageIO.write(image, "png", outputfile);
	                
	                /*
	               ImageIO.write(image , "jpg", new File( destinationDir +fileName+"_"+pageNumber+".jpg" ));
ImageIO.write(image , "jpeg", new File( destinationDir +fileName+"_"+pageNumber+".jpeg" ));
ImageIO.write(image , "png", new File( destinationDir +fileName+"_"+pageNumber+".png" ));
ImageIO.write(image , "bmp", new File( destinationDir +fileName+"_"+pageNumber+".bmp" ));
ImageIO.write(image , "gif", new File( destinationDir +fileName+"_"+pageNumber+".gif" ));
	                 */
	                
	                
	                
	                
	                pageNumber++;
	            }
	            document.close();
	            System.out.println("Converted Images are saved at -> "+ destinationFile.getAbsolutePath());
	        } else {
	            System.err.println(sourceFile.getName() +" File not exists");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	}
