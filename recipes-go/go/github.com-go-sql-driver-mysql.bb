DESCRIPTION = "github.com/go-sql-driver/mysql"

GO_IMPORT = "github.com/go-sql-driver/mysql"

inherit go

SRC_URI = "git://github.com/go-sql-driver/mysql;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "2e00b5cd70399450106cec6431c2e2ce3cae5034" 
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

FILES:${PN} += "${GOBIN_FINAL}/*"
