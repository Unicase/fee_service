<?xml version="1.0"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" indent="yes"/>
	
	<xsl:strip-space elements="*"/>
	
	<xsl:template match="@* | node()">
      <xsl:copy>
         <xsl:apply-templates select="@* | node()"/>
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="contract">
		<contract>
			<cidentifier>
				<xsl:value-of select="source"/>
				<xsl:text>-</xsl:text>
				<xsl:value-of select="identifier"/>
				<xsl:text>-</xsl:text>
				<xsl:value-of select="version"/>
			</cidentifier>
			<xsl:apply-templates/>
		</contract>
	</xsl:template>
</xsl:stylesheet>
