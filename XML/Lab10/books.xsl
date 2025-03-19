<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" omit-xml-declaration="yes"/>
<xsl:template match="/books/book">
<html><body>
<h1>JLC Books</h1>
	
		<center>
		<h1>
		BookId: <xsl:value-of select="@bid"/><br/>
		BookName: <xsl:value-of select="bname"/><br/>
		Author: <xsl:value-of select="authors/author"/><br/>
		Cost: <xsl:value-of select="cost"/><br/>
		</h1>
		</center>

</body></html>
</xsl:template>
</xsl:stylesheet>