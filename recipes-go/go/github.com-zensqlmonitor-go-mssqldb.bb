DESCRIPTION = "github.com/zensqlmonitor/go-mssqldb"

GO_IMPORT = "github.com/zensqlmonitor/go-mssqldb"

inherit go

SRC_URI = "git://github.com/zensqlmonitor/go-mssqldb;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "ffe5510c6fa5e15e6d983210ab501c815b56b363" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=591778525c869cdde0ab5a1bf283cd81"

FILES:${PN} += "${GOBIN_FINAL}/*"

GO_INSTALL = "\
    ${GO_IMPORT} \
    "

DEPENDS+="\
   github.com-denisenkom-go-mssqldb \
"