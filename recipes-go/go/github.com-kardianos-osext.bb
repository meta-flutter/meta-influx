DESCRIPTION = "github.com/kardianos/osext"

GO_IMPORT = "github.com/kardianos/osext"

inherit go

SRC_URI = "git://github.com/kardianos/osext;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "c2c54e542fb797ad986b31721e1baedf214ca413" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81"

FILES:${PN} += "${GOBIN_FINAL}/*"
