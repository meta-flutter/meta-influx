DESCRIPTION = "github.com/dgrijalva/jwt-go"

GO_IMPORT = "github.com/dgrijalva/jwt-go"

inherit go

SRC_URI = "git://github.com/dgrijalva/jwt-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "24c63f56522a87ec5339cc3567883f1039378fdb"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=276f2f3ba3749d25f6a6f5fb852d462e"

FILES:${PN} += "${GOBIN_FINAL}/*"
