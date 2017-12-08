create index IX_F2B66865 on LS_Feedback (companyId);
create index IX_435B4E69 on LS_Feedback (feedbackText[$COLUMN_LENGTH:75$]);
create index IX_6E03C1D2 on LS_Feedback (groupId, feedBackStatus);
create index IX_85ED4F17 on LS_Feedback (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_43DCAF59 on LS_Feedback (uuid_[$COLUMN_LENGTH:75$], groupId);