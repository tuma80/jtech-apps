<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/tundra/tundra.css" rel="stylesheet" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js" djConfig="parseOnLoad:true,isDebug:true"></script>
<script type="text/javascript">
dojo.require("dijit.layout.AccordionContainer");
dojo.require("dijit.layout.AccordionPane");
dojo.require("dijit.ColorPalette");
</script>
</head>
<body class="tundra">
<div id="accordionDiv" dojoType="dijit.layout.AccordionContainer"
		style="width: 300px; height: 400px">
		<!-- First Pane - Sample -->
		<div dojoType="dijit.layout.AccordionPane" selected="true"
			title="Sample Pane">I am in First Pane</div>
			
		<!-- Pane for Colorpalette -->	
		<div dojoType="dijit.layout.AccordionPane" selected="false" title="Color Palette">
			<div dojoType="dijit.ColorPalette" id="colorPaletteDiv"></div>
		</div>
</div>		
</body>
</html>
