DESCRIPTION = "github.com/dgrijalva/jwt-go"

GO_IMPORT = "github.com/dgrijalva/jwt-go"

inherit go

SRC_URI = "git://github.com/dgrijalva/jwt-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "24c63f56522a87ec5339cc3567883f1039378fdb"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=818c0a1d81cfcfdb7ecd58db268bab7e"

FILES_${PN} += "${GOBIN_FINAL}/*"
