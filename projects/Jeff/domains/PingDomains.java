package JeffDomainAnalysis;

import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

public class PingDomains {

	public static void main(String[] args) throws Exception {
		
		
		// array of all domains
		String [] arrayurl = new String [] {
				"http://catalog.pearsonglobalschools.com",
				"http://assets.pearsonschoolcanada.ca",
				"http://acorn.pearsonschoolcanada.ca",
				"http://findyourtextbook.com",
				"http://k12catalog.pearson.com",
				"http://mypearsonmobile.com",
				"http://www.pearsonschoolcanada.ca",
				"http://www.pearsonpd.com",
				"http://pearsoncanadaschool.com",
				"http://www.pearsonelectives.com",
				"http://pearsonelectives.com",
				"http://www.mypearsonmobile.com",
				"http://www.findyourtextbook.com",
				"http://pearsonhomeschool.com",
				"http://staging.pearsonschoolcanada.ca",
				"http://pearsonpd.com",
				"http://sfcatalog.pearson.com",
				"http://pearsonschoolcanada.ca",
				"http://pelcatalog.pearson.com",
				"http://phcatalog.pearson.com",
				"http://plgcatalog.pearson.com",
				"http://pearsonglobalschools.com",
				"http://staging.pearsonpd.com",
				"http://staging.pearsoncanadaschool.com",
				"http://staging.pearsonglobalschools.com",
				"http://acorn.pearsonglobalschools.com",
				"http://www.pearsoncanadaschool.com",
				"http://acorn.pearsoncanadaschool.com",
				"http://www.pearsonglobalschools.com",
				"http://acorn.pearsonpd.com",
				"http://acorn.pearsonhomeschool.com",
				"http://staging.pearsonhomeschool.com",
				"http://www.pearsonhomeschool.com",
				"http://plgcatalog.pearson.com",
				"http://sfcatalog.pearson.com",
				"http://phcatalog.pearson.com",
				"http://pelcatalog.pearson.com",
				"http://k12catalog.pearson.com",
				"http://flipbooks.pearsonschool.com",
				"http://www.novanet.com",
				"http://ccclearn.com",
				"http://images.pearsonschool.com",
				"http://writingandgrammar.com",
				"http://www.pearsonlt.com",
				"http://www.writingandgrammar.com",
				"http://flipbooks.pearsonschool.com",
				"http://usingexploringlife.com",
				"http://staging.k12playbook.com",
				"http://timelessvoicestimelessthemes.com",
				"http://assets.k12playbook.com",
				"http://www.timelessvoicestimelessthemes.com",
				"http://acorn.k12playbook.com",
				"http://texasliterature.com",
				"http://www.pearsonschool.com",
				"http://www.texasliterature.com",
				"http://acorn.pearsonschool.com",
				"http://stimulusforschools.com",
				"http://emails.pearsonschool.com",
				"http://www.stimulusforschools.com",
				"http://www.pearsononlinesampling.com",
				"http://lincert.sfscience.com",
				"http://pearsonschool.com",
				"http://lin.sfscience.com",
				"http://pearsononlinesampling.com",
				"http://scottforesmancatalog.com",
				"http://staging.pearsonschool.com",
				"http://schoolfundingresource.org",
				"http://onetoone.pearsoned.com",
				"http://www.schoolfundingresource.org",
				"http://commoncore.pearsoned.com",
				"http://schoolfundingresource.net",
				"http://staging.commoncore.pearsoned.com",
				"http://www.schoolfundingresource.net",
				"http://acorn.commoncore.pearsoned.com",
				"http://schoolfundingresource.info",
				"http://rti.pearsoned.com",
				"http://www.schoolfundingresource.info",
				"http://dimensionm.pearsonschool.com",
				"http://schoolfundingresource.com",
				"http://productsafety.pearson.com",
				"http://www.schoolfundingresource.com",
				"http://assets.pearsoncanadaschool.com",
				"http://schoolfundingresource.biz",
				"http://assets.pearsonglobalschools.com",
				"http://www.schoolfundingresource.biz",
				"http://assets.pearsonpd.com",
				"http://precisionplanner.com",
				"http://assets.pearsonschool.com",
				"http://phworldstudies.com",
				"http://programs.pearsonpd.com",
				"http://www.phworldstudies.com",
				"http://blog.pearsonhomeschool.com",
				"http://phmath2010.org",
				"http://blog.pearsonschool.com",
				"http://www.phmath2010.org",
				"http://assets.pearsonhomeschool.com",
				"http://phmath2010.net",
				"http://partner.pearsonglobalschools.com",
				"http://www.phmath2010.net",
				"http://siop.pearson.com",
				"http://phmath2010.biz",
				"http://www.phmath2010.biz",
				"http://phmath.com",
				"http://www.phmath.com",
				"http://phlitonline.com",
				"http://www.phlitonline.com",
				"http://phliterature.com",
				"http://www.phliterature.com",
				"http://phalgebra.com",
				"http://www.phalgebra.com",
				"http://ampreading.pearsontc.net",
				"http://admin.k12catalog.pearsontc.net",
				"http://98.ampreading.pearsontc.net",
				"http://ampreadinglin.pearsontc.net",
				"http://k12catalog.pearsontc.net",
				"http://pearsonschoolapps.com",
				"http://www.pearsonschoolapps.com",
				"http://admin.devjobs.lin.pearsonschool.com",
				"http://pearsonphlit.com",
				"http://www.pearsonphlit.com",
				"http://pearsonlt.com",
				"http://www.pearsonlt.com",
				"http://ampreading.pearsonlearning.com",
				"http://98.www.pearsonlearning.com",
				"http://emarketing.pearsonlearning.com",
				"http://pearsonfundingresources.org",
				"http://www.pearsonfundingresources.org",
				"http://pearsonfundingresources.net",
				"http://www.pearsonfundingresources.net",
				"http://pearsonfundingresources.info",
				"http://www.pearsonfundingresources.info",
				"http://pearsonfundingresources.com",
				"http://www.pearsonfundingresources.com",
				"http://pearsonfundingresources.biz",
				"http://www.pearsonfundingresources.biz",
				"http://pearsonfundingresource.org",
				"http://www.pearsonfundingresource.org",
				"http://pearsonfundingresource.net",
				"http://www.pearsonfundingresource.net",
				"http://pearsonfundingresource.info",
				"http://www.pearsonfundingresource.info",
				"http://pearsonfundingresource.com",
				"http://www.pearsonfundingresource.com",
				"http://pearsonfundingresource.biz",
				"http://www.pearsonfundingresource.biz",
				"http://pasoapaso.com",
				"http://parentingeducation.com",
				"http://newmexicoliterature.com",
				"http://www.newmexicoliterature.com",
				"http://myworldgeography.com",
				"http://www.myworldgeography.com",
				"http://millerlevinebiology.com",
				"http://www.millerlevinebiology.com",
				"http://millerlevine.com",
				"http://www.millerlevine.com",
				"http://millerandlevinebiology.com",
				"http://www.millerandlevinebiology.com",
				"http://magrudersamericangovernment.com",
				"http://www.magrudersamericangovernment.com",
				"http://labzoneeasyplanner.com",
				"http://www.labzoneeasyplanner.com",
				"http://k12stimulusfunds.org",
				"http://www.k12stimulusfunds.org",
				"http://k12stimulusfunds.net",
				"http://www.k12stimulusfunds.net",
				"http://k12stimulusfunds.info",
				"http://www.k12stimulusfunds.info",
				"http://k12stimulusfunds.biz",
				"http://www.k12stimulusfunds.biz",
				"http://k12stimulusfund.org",
				"http://www.k12stimulusfund.org",
				"http://k12stimulusfund.net",
				"http://www.k12stimulusfund.net",
				"http://k12stimulusfund.info",
				"http://www.k12stimulusfund.info",
				"http://k12stimulusfund.com",
				"http://www.k12stimulusfund.com",
				"http://k12stimulusfund.biz",
				"http://www.k12stimulusfund.biz",
				"http://georgialiterature.com",
				"http://www.georgialiterature.com",
				"http://floridaliterature.com",
				"http://www.floridaliterature.com",
				"http://cpsurf.com",
				"http://connect2dra.com",
				"http://www.connect2dra.com",
				"http://cnconline.com",
				"http://www.cnconline.com",
				"http://californialiterature.com",
				"http://www.californialiterature.com",
				"http://californialiteracy.com",
				"http://www.californialiteracy.com",
				"http://biosurf.com",
				"http://arkansasliterature.com",
				"http://www.arkansasliterature.com",
				"http://access.agsglobe.com",
				"http://northcarolinaliteracy.com",
				"http://www.northcarolinaliteracy.com",
				"http://northcarolinaliterature.com",
				"http://www.northcarolinaliterature.com",
				"http://programs.pearsonpd.com",
				"http://myworldsocialstudies.com",
				"http://www.myworldsocialstudies.com",
				"http://joinopenclass.com",
				"http://www.joinopenclass.com",
				"http://assets.pearsonschoolapps.com",
				"http://catalog.pearsonglobalschools.com",
				"http://pearsonlearning.com",
				"http://www.scottforesman.com",
				"http://www.sfsocialstudies.com",
				"http://www.sfreading.com",
				"http://www.sfscience.com",
				"http://www.sbgmath.com",
				"http://www.sbgmusic.com",
				"http://www.mathsurf.com",
				"http://www.everydayspelling.com",
				"http://www.sbgschool.com",
				"http://www.onlineintervention.com",
				"http://www.sbgreligion.com",
				"http://www.estudiossocialessf.com",
				"http://www.myworldpearson.com",
				"http://www.lecturasf.com",
				"http://www.sfsocialstudiestx.com",
				"http://www.sfmath.com",
				"http://www.sflectura.com",
				"http://www.scottforesman-hr.com",
				"http://www.mathsurftexas.com",
				"http://www.mathsurfspanish.com",
				"http://www.ca-hss.com",
				"http://www.pearsonschool.com",
				"http://staging.pearsonschool.com",
				"http://acorn.pearsonschool.com",
				"http://www.pearsonschoolcanada.ca",
				"http://staging.pearsonschoolcanada.ca",
				"http://assets.pearsonschoolcanada.ca",
				"http://acorn.pearsonschoolcanada.ca",
				"http://www.pearsonschoolcanada.com",
				"http://staging.pearsonschoolcanada.com",
				"http://assets.pearsonschoolcanada.com",
				"http://acorn.pearsonschoolcanada.com",
				"http://www.pearsoncanadaschool.com",
				"http://staging.pearsoncanadaschool.com",
				"http://acorn.pearsoncanadaschool.com",
				"http://www.pearsonglobalschools.com",
				"http://staging.pearsonglobalschools.com",
				"http://acorn.pearsonglobalschools.com",
				"http://www.findyourtextbook.com",
				"http://onetoone.pearsoned.com",
				"http://www.pearsonelectives.com",
				"http://commoncore.pearsoned.com",
				"http://staging.commoncore.pearsoned.com",
				"http://acorn.commoncore.pearsoned.com",
				"http://playbook.pearsonschool.com",
				"http://staging.playbook.pearsonschool.com",
				"http://acorn.playbook.pearsonschool.com",
				"http://playbook.pearsonglobalschools.com",
				"http://staging.playbook.pearsonglobalschools.com",
				"http://acorn.playbook.pearsonglobalschools.com",
				"http://playbook.pearsonschoolcanada.ca",
				"http://staging.playbook.pearsonschoolcanada.ca",
				"http://acorn.playbook.pearsonschoolcanada.ca",
				"http://www.pearsonpd.com",
				"http://staging.pearsonpd.com",
				"http://acorn.pearsonpd.com",
				"http://rti.pearsoned.com",
				"http://www.mypearsonmobile.com",
				"http://www.trypearsontexas.com",
				"http://images.pearsonschool.com",
				"http://www.pearsonschoolcatalogue.ca",
				"http://www.pearsoncanadaschool.ca",
				"http://www.biology.com",
				"http://www.principalcompass.com",
				"http://www.floridareadingstreet.com",
				"http://www.connectedmathematics3.com",
				"http://www.phwritingcoach.com",
				"http://www.commoncoreanswers.com",
				"http://www.cmp3sampler.com",
				"http://www.myworldhistory.com",
				"http://www.iseeilearnatschool.com",
				"http://www.pearsonschoolimprovement.com",
				"http://www.californiascience.com",
				"http://www.illinoistextbookloanprogram.com",
				"http://www.envisionmath.com",
				"http://www.planetthink.net",
				"http://www.ampforsuccess.com",
				"http://www.pearsonearlylearning.com",
				"http://www.wordstheirway.com",
				"http://dimensionm.pearsonschool.com",
				"http://www.pearsonell.com",
				"http://www.investigations2.com",
				"http://www.successtracker.com",
				"http://www.pelowl.com",
				"http://www.plaidphonics.com",
				"http://www.singspell.com",
				"http://www.problemsolvingexperiences.com",
				"http://www.drahome.com",
				"http://www.iopeners-nonfiction.com",
				"http://www.iopeners.info",
				"http://www.bigmathforlittlekids.com",
				"http://www.openingtheworldoflearning.com",
				"http://www.quickreadstech.com",
				"http://www.goodhabitsgreatreaders.com",
				"http://www.draonlinewriter.com",
				"http://www.nimblewithnumbers.com",
				"http://www.mcpquickreads.com",
				"http://www.pairupreading.com",
				"http://www.pearsonlearninggroup.com",
				"http://www.pearsonatschool.com",
				"http://www.gfamericanhistory.com",
				"http://www.k12stimulusfunds.com",
				"http://productsafety.pearson.com",
				"http://www.phmath2010.com",
				"http://www.poweralgebra.com",
				"http://www.powergeometry.com",
				"http://www.pearsonprivateschools.com",
				"http://www.pearsonprivateschool.net",
				"http://www.pearsonprivateschools.net",
				"http://www.pearsonprivateschool.org",
				"http://www.pearsonprivateschools.org",
				"http://www.privateschoolpearson.com",
				"http://www.privateschoolspearson.com",
				"http://www.privateschoolpearson.net",
				"http://www.privateschoolspearson.net",
				"http://www.privateschoolpearson.org",
				"http://www.privateschoolspearson.org",
				"http://www.realidades.com",
				"http://www.myscienceonline.com",
				"http://www.myfloridascience.com",
				"http://www.pearson21.com",
				"http://www.pearson21.net",
				"http://www.pearson21.org",
				"http://www.pearson21.biz",
				"http://www.pearsononlinesampling.com",
				"http://www.pearsononlinesampling.net",
				"http://www.pearsononlinesampling.org",
				"http://www.phhsmath.com",
				"http://www.pearsonideashare.com",
				"http://www.myenvironmentalscience.com",
				"http://www.pearsonowl.com",
				"http://www.pearson21canada.com",
				"http://www.pearson21canada.ca",
				"http://www.pearsonsummerschoolmath.com",
				"http://www.mysummerschoolmath.com",
				"http://www.digitsmath.com",
				"http://www.pearsonchem.com",
				"http://www.pearsonchem12.com",
				"http://www.pearsononlinesamples.com",
				"http://www.mytexasscience.com",
				"http://www.pearsondigitallearning.com",
				"http://www.pearsondigital.com",
				"http://www.pearsonmyworld.com",
				"http://www.pearsoncustomschoolsuite.com",
				"http://www.agsglobe.com",
				"http://www.agscareer.com",
				"http://www.agscorrectional.com",
				"http://www.agseducate.com",
				"http://www.agseducation.com",
				"http://www.agsenglish.com",
				"http://www.agseric.com",
				"http://www.agsged.com",
				"http://www.agsglobe.biz",
				"http://www.agsglobe.net",
				"http://www.agsglobe.org",
				"http://www.agsglobe.us",
				"http://www.agsglobelal1.com",
				"http://www.agsglobelal2.com",
				"http://www.agsglobelal3.com",
				"http://www.agsglobepm.com",
				"http://www.agsglobepmwh.com",
				"http://www.agsglobewgc.com",
				"http://www.agsglobewh.com",
				"http://www.agsguidance.com",
				"http://www.agsheadstart.com",
				"http://www.agslearn.com",
				"http://www.agslearning.com",
				"http://www.agsnet.org",
				"http://www.agsnewmexico.com",
				"http://www.agsonline.com",
				"http://www.agspearson.com",
				"http://www.agspublishing.info",
				"http://www.agspublishing.net",
				"http://www.agspublishing.org",
				"http://www.agspublishing.ws",
				"http://www.agssocialstudies.com",
				"http://www.agssummerschool.com",
				"http://www.americanguidanceservice.com",
				"http://www.aprendaprep.com",
				"http://www.cooperativediscipline.com",
				"http://www.fcatprep.com",
				"http://www.floridaese.com",
				"http://www.georgiatextbooks.com",
				"http://www.globeags.com",
				"http://www.itbsprep.com",
				"http://www.njtestprep.com",
				"http://www.northcarolinatextbooks.com",
				"http://www.occupationaldiploma.com",
				"http://www.pactprep.com",
				"http://www.pact-prep.com",
				"http://www.pearsonags.com",
				"http://www.pearsonagsglobe.com",
				"http://www.southcarolinatextbooks.com",
				"http://www.specialneedsresource.com",
				"http://www.stanford9prep.com",
				"http://www.terranovaprep.com",
				"http://www.test-preparation.com",
				"http://www.agsnet.com",
				"http://www.pearsonprivateschool.com",
				"http://pearsonprivateschools.com",
				"http://pearsonprivateschool.net",
				"http://pearsonprivateschools.net",
				"http://pearsonprivateschool.org",
				"http://pearsonprivateschools.org",
				"http://privateschoolpearson.com",
				"http://privateschoolspearson.com",
				"http://privateschoolpearson.net",
				"http://privateschoolspearson.net",
				"http://privateschoolpearson.org",
				"http://privateschoolspearson.org",
				"http://pearsononlinesampling.com",
				"http://pearsononlinesampling.net",
				"http://pearsononlinesampling.org",
				"http://digitsmath.com",
				"http://scottforesman.com",
				"http://sfsocialstudies.com",
				"http://sfreading.com",
				"http://sfscience.com",
				"http://sbgmath.com",
				"http://sbgmusic.com",
				"http://mathsurf.com",
				"http://everydayspelling.com",
				"http://sbgschool.com",
				"http://onlineintervention.com",
				"http://sbgreligion.com",
				"http://estudiossocialessf.com",
				"http://myworldpearson.com",
				"http://lecturasf.com",
				"http://sfsocialstudiestx.com",
				"http://sfmath.com",
				"http://sflectura.com",
				"http://scottforesman-hr.com",
				"http://mathsurftexas.com",
				"http://mathsurfspanish.com",
				"http://ca-hss.com",
				"http://pearsonschool.com",
				"http://pearsonschoolcanada.ca",
				"http://pearsonschoolcanada.com",
				"http://pearsoncanadaschool.com",
				"http://pearsonglobalschools.com",
				"http://findyourtextbook.com",
				"http://pearsonelectives.com",
				"http://pearsonpd.com",
				"http://mypearsonmobile.com",
				"http://trypearsontexas.com",
				"http://pearsonschoolcatalogue.ca",
				"http://pearsoncanadaschool.ca",
				"http://biology.com",
				"http://principalcompass.com",
				"http://floridareadingstreet.com",
				"http://connectedmathematics3.com",
				"http://phwritingcoach.com",
				"http://commoncoreanswers.com",
				"http://cmp3sampler.com",
				"http://myworldhistory.com",
				"http://iseeilearnatschool.com",
				"http://pearsonschoolimprovement.com",
				"http://californiascience.com",
				"http://illinoistextbookloanprogram.com",
				"http://envisionmath.com",
				"http://planetthink.net",
				"http://ampforsuccess.com",
				"http://pearsonearlylearning.com",
				"http://wordstheirway.com",
				"http://pearsonell.com",
				"http://investigations2.com",
				"http://successtracker.com",
				"http://pelowl.com",
				"http://plaidphonics.com",
				"http://singspell.com",
				"http://problemsolvingexperiences.com",
				"http://drahome.com",
				"http://iopeners-nonfiction.com",
				"http://iopeners.info",
				"http://bigmathforlittlekids.com",
				"http://openingtheworldoflearning.com",
				"http://quickreadstech.com",
				"http://goodhabitsgreatreaders.com",
				"http://draonlinewriter.com",
				"http://nimblewithnumbers.com",
				"http://mcpquickreads.com",
				"http://pairupreading.com",
				"http://pearsonlearninggroup.com",
				"http://pearsonatschool.com",
				"http://gfamericanhistory.com",
				"http://k12stimulusfunds.com",
				"http://phmath2010.com",
				"http://poweralgebra.com",
				"http://powergeometry.com",
				"http://realidades.com",
				"http://myscienceonline.com",
				"http://myfloridascience.com",
				"http://pearson21.com",
				"http://pearson21.net",
				"http://pearson21.org",
				"http://pearson21.biz",
				"http://phhsmath.com",
				"http://pearsonideashare.com",
				"http://myenvironmentalscience.com",
				"http://pearsonowl.com",
				"http://pearson21canada.com",
				"http://pearson21canada.ca",
				"http://pearsonsummerschoolmath.com",
				"http://mysummerschoolmath.com",
				"http://pearsonchem.com",
				"http://pearsonchem12.com",
				"http://pearsononlinesamples.com",
				"http://mytexasscience.com",
				"http://pearsondigitallearning.com",
				"http://pearsondigital.com",
				"http://pearsonmyworld.com",
				"http://pearsoncustomschoolsuite.com",
				"http://agsglobe.com",
				"http://agscareer.com",
				"http://agscorrectional.com",
				"http://agseducate.com",
				"http://agseducation.com",
				"http://agsenglish.com",
				"http://agseric.com",
				"http://agsged.com",
				"http://agsglobe.biz",
				"http://agsglobe.net",
				"http://agsglobe.org",
				"http://agsglobe.us",
				"http://agsglobelal1.com",
				"http://agsglobelal2.com",
				"http://agsglobelal3.com",
				"http://agsglobepm.com",
				"http://agsglobepmwh.com",
				"http://agsglobewgc.com",
				"http://agsglobewh.com",
				"http://agsguidance.com",
				"http://agsheadstart.com",
				"http://agslearn.com",
				"http://agslearning.com",
				"http://agsnet.org",
				"http://agsnewmexico.com",
				"http://agsonline.com",
				"http://agspearson.com",
				"http://agspublishing.info",
				"http://agspublishing.net",
				"http://agspublishing.org",
				"http://agspublishing.ws",
				"http://agssocialstudies.com",
				"http://agssummerschool.com",
				"http://americanguidanceservice.com",
				"http://aprendaprep.com",
				"http://cooperativediscipline.com",
				"http://fcatprep.com",
				"http://floridaese.com",
				"http://georgiatextbooks.com",
				"http://globeags.com",
				"http://itbsprep.com",
				"http://njtestprep.com",
				"http://northcarolinatextbooks.com",
				"http://occupationaldiploma.com",
				"http://pactprep.com",
				"http://pact-prep.com",
				"http://pearsonags.com",
				"http://pearsonagsglobe.com",
				"http://southcarolinatextbooks.com",
				"http://specialneedsresource.com",
				"http://stanford9prep.com",
				"http://terranovaprep.com",
				"http://test-preparation.com",
				"http://agsnet.com",
				"http://emails.pearsonschool.com",
				"http://assets.pearsoncanadaschool.com",
				"http://assets.pearsonglobalschools.com",
				"http://assets.playbook.pearsonglobalschools.com",
				"http://assets.playbook.pearsonschoolcanada.ca",
				"http://assets.playbook.pearsonschool.com",
				"http://assets.pearsonpd.com",
				"http://assets.pearsonschool.com",
				"http://ebod.pearsonschoolapps.com",
				"http://k12cms.pearsonschoolapps.com",
				"http://k12cmsjob.pearsonschoolapps.com",
				"http://k12security.pearsonschoolapps.com",
				"http://api.pearsonschoolapps.com",
				"http://blog.pearsonschool.com",
				"http://pearsonlearningservices.com",
				"http://www.pearsonlearningservices.com",
				"http://pearsonprivateschool.com",
				"http://k12cdb.pearsonschoolapps.com",
				"http://partner.pearsonglobalschools.com",
				"http://siop.pearson.com",
				"http://www.pearsonbacconline.com",
				"http://pearsonbaccalaureate.com",
				"http://k12playbook.com",
				"http://www.k12playbook.com",
				"http://233.95.182.159.in-addr.arpa",
				"http://233.95.182.159.in-addr.arpa",
				"http://",
				"http://admin.devjobs.lin.pearsonschool.com.",
				"http://playbook.pearsonschool.com.",
				"http://staging.playbook.pearsonschool.com.",
				"http://acorn.playbook.pearsonschool.com.",
				"http://playbook.pearsonglobalschools.com.",
				"http://staging.playbook.pearsonglobalschools.com.",
				"http://acorn.playbook.pearsonglobalschools.com.",
				"http://playbook.pearsonschoolcanada.ca.",
				"http://staging.playbook.pearsonschoolcanada.ca.",
				"http://acorn.playbook.pearsonschoolcanada.ca.",
				"http://assets.playbook.pearsonglobalschools.com.",
				"http://assets.playbook.pearsonschoolcanada.ca.",
				"http://assets.playbook.pearsonschool.com.",
				"http://pearsonlearningservices.com.",
				"http://www.pearsonlearningservices.com.",
				"http://k12playbook.com.",
				"http://www.k12playbook.com."

		};
		
		
		
		for (int i=0; i<arrayurl.length; i++){
			
	
			
		String urlString = arrayurl[i];
		

		
		try {
		
		URL url = new URL(urlString);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setInstanceFollowRedirects(true);
		connection.setRequestMethod("GET");
		connection.connect();
		int code = connection.getResponseCode();
		System.out.println(urlString+">"+code);
		
		
			InetAddress address = InetAddress.getByName(new URL(urlString).getHost());
			//System.out.println(urlString+">"+address.getHostAddress());
	
			}
		catch (Exception e){
			System.out.println(urlString+">IP not found");
		}
		
		
		
		
		
		
	}
		
		
	}

}