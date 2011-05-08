<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>jtech-apps</title>
<link
	href="http://ajax.googleapis.com/ajax/libs/dojo/1.6.0/dijit/themes/claro/claro.css"
	rel="stylesheet" type="text/css" />
<script
	src="http://ajax.googleapis.com/ajax/libs/dojo/1.6.0/dojo/dojo.xd.js"
	djConfig="parseOnLoad:true,isDebug:true"></script>

<script type="text/javascript">
	dojo.require("dijit.layout.BorderContainer");
	dojo.require("dijit.layout.TabContainer");
	dojo.require("dijit.layout.ContentPane");
	dojo.require("dijit.form.Form");
	dojo.require("dijit.form.Textarea");
	dojo.require("dijit.form.Button");
	dojo.require("dijit.TitlePane");
	dojo.require("dojox.json.schema");
	dojo.require("dijit.Dialog");
	
	dojo.ready(function(){
		dojo.connect(dojo.byId("validateBtn"),"onclick","validateBtn_onClick");
	});
	
	function validateBtn_onClick(){		
		jschema=dijit.byId("jsonSchema").get("value");
		jdata=dijit.byId("jsonData").get("value");
		results = dojox.json.schema.validate(dojo.fromJson(jdata), dojo.fromJson(jschema));
		if(results.valid){
			displayResultDialog("Valid!");
		}else{
			displayResultDialog("<span style=\"color:red\">Invalid! Please check error console for error in detail</span>");
			dojox.json.schema.mustBeValid(results);			
		}
	}
	function displayResultDialog(message){		
		  // create the dialog:
		myDialog = new dijit.Dialog({
			title: "Json Data Validation Result",
		    content: message,
		    style: "width: 300px"
		});
		myDialog.show();
	}
</script>


<style type="text/css">
body,html {
	width: 100%;
	height: 100%;
	margin: 0;
	padding: 0;
	overflow: hidden;
}

#borderContainer {
	width: 100%;
	height: 100%
}
</style>
</head>
<body class="claro">
	<div id="basic" style="height:100%;background-color: #EEEEFF;position:absolute;">
	</div>
	<div dojoType="dijit.layout.BorderContainer" design="sidebar"
		gutters="true" liveSplitters="true" id="borderContainer">
		<div dojoType="dijit.layout.ContentPane" region="top">
			Jitendra Takalkar
		</div>
		<div dojoType="dijit.layout.ContentPane" region="center">
			 <div dojoType="dijit.layout.TabContainer" doLayout="true">
                <div dojoType="dijit.layout.ContentPane" title="Json Data Validator-Dojo" selected="true">
                    <form dojoType="dijit.form.Form" id="jsonSchemaValidatorForm">
						<table border="0" style="width:80%">
							<tr>
								<td  align="right" valign="top" style="text-align:left;width:50%">
									<div dojoType="dijit.TitlePane" title="Json Schema">
										<textarea dojoType="dijit.form.Textarea" cols="70" rows="5" id="jsonSchema">
											{properties:{foo:{type:"string"},boo:{type:"number"}}}
										</textarea>
									</div>
								</td>
								<td align="left" valign="top" style="text-align:left;width:50%">
									<div dojoType="dijit.TitlePane" title="Json Data">
										<textarea dojoType="dijit.form.Textarea" cols="70" rows="5" id="jsonData">
											{foo: "sample",boo: 20}
										</textarea>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<button id="validateBtn" dojoType="dijit.form.Button" onClick="">Validate</button>
								</td>
							</tr>
						</table>
					</form>
                </div>
                <div dojoType="dijit.layout.ContentPane" title="Json Data Validator-jQuery">
                	<div dojoType="dijit.TitlePane" title="Json Schema">
                    	Work In Progress ...
                    </div>             
                </div>
            </div>
		</div>
	</div>
</body>
</html>
