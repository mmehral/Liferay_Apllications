create table cholacompliance_compliance (
	compliance_id LONG not null primary key,
	compliance_tite VARCHAR(250) null,
	compliance_shortdescription VARCHAR(250) null,
	compliance_description TEXT null,
	compliance_document_name VARCHAR(250) null,
	compliance_document_extension VARCHAR(75) null,
	compliance_document_path VARCHAR(100) null,
	createDate DATE null,
	modifiedDate DATE null
);