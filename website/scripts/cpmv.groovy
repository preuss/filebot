// filebot -script "http://filebot.sf.net/scripts/cpmv.groovy" <folder>

// copy files
def temp = args*.copyTo("E:/filebot-temp")

// sort copies into the given file structure
temp.eachMediaFolder { 
	rename(folder:it, format:'E:/TV Shows/{n}/{n} - {s00e00} - {t}', db:'thetvdb')
}

// delete temporary folders
temp*.deleteDir()
