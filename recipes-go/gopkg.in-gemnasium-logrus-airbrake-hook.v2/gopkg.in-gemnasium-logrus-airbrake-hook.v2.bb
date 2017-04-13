DESCRIPTION = "gopkg.in/gemnasium/logrus-airbrake-hook.v2"

GO_IMPORT = "gopkg.in/gemnasium/logrus-airbrake-hook.v2"

inherit go

SRC_URI = "git://github.com/gemnasium/logrus-airbrake-hook;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "bfee1239d796830ca346767650cce5ba90d58c57" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=77c2be6cc3055081144bb84fa1054d95"

FILES_${PN} += "${GOBIN_FINAL}/*"
