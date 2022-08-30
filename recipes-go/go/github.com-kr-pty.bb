DESCRIPTION = "github.com/kr/pty"

GO_IMPORT = "github.com/kr/pty"

inherit go

SRC_URI = "git://github.com/kr/pty;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "2c10821df3c3cf905230d078702dfbe9404c9b23" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=93958070863d769117fa33b129020050"

FILES:${PN} += "${GOBIN_FINAL}/*"
