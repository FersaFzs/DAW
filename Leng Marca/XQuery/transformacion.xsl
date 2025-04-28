<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" encoding="UTF-8" indent="yes"/>
  
  <xsl:template match="/">
    <html>
      <head>
        <title>Catálogo de Ratones Gaming</title>
        <style>
          table { border-collapse: collapse; width: 80%; margin: 20px auto; }
          th, td { border: 1px solid black; padding: 10px; text-align: left; }
          th { background-color: #4CAF50; color: white; }
          tr:nth-child(even) { background-color: #f2f2f2; }
          tr:hover { background-color: #ddd; }
        </style>
      </head>
      <body>
        <h2>Catálogo de Ratones Gaming</h2>
        <table>
          <tr>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Precio (€)</th>
            <th>DPI</th>
            <th>Conexión</th>
            <th>Peso (g)</th>
          </tr>
          <xsl:for-each select="mice_catalog/mouse">
            <tr>
              <td><xsl:value-of select="brand"/></td>
              <td><xsl:value-of select="model"/></td>
              <td>
                <xsl:choose>
                  <xsl:when test="price > 100">
                    <xsl:attribute name="style">color: red;</xsl:attribute>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:attribute name="style">color: green;</xsl:attribute>
                  </xsl:otherwise>
                </xsl:choose>
                <xsl:value-of select="price"/>
              </td>
              <td><xsl:value-of select="dpi"/></td>
              <td>
                <xsl:if test="connection = 'Wireless'">
                  <xsl:attribute name="style">font-weight: bold;</xsl:attribute>
                </xsl:if>
                <xsl:value-of select="connection"/>
              </td>
              <td>
                <xsl:element name="span">
                  <xsl:attribute name="class">weight</xsl:attribute>
                  <xsl:value-of select="weight"/>
                </xsl:element>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>