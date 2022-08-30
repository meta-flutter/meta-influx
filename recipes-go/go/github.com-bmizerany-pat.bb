DESCRIPTION = "github.com/bmizerany/pat"

GO_IMPORT = "github.com/bmizerany/pat"

inherit go

SRC_URI = "git://github.com/bmizerany/pat;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "c068ca2f0aacee5ac3681d68e4d0a003b7d1fd2c"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/README.md;md5=3b558b273cee6c2b170793783b3d2e13"

FILES:${PN} += "${GOBIN_FINAL}/*"
