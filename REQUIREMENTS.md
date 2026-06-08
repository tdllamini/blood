# Blood Bank Management System Requirements

## Functional Requirements

### FR-1: User Authentication
- FR-1.1: The system shall authenticate users via username and password
- FR-1.2: The system shall support three user roles: ADMIN, STAFF, DONOR
- FR-1.3: The system shall enforce role-based access control for all system features
- FR-1.4: The system shall provide password hashing for stored credentials
- FR-1.5: The system shall implement session timeout after 30 minutes of inactivity

### FR-2: Donor Management
- FR-2.1: The system shall allow donors to register with personal details (name, contact, DOB, blood type)
- FR-2.2: The system shall allow donors to view and edit their profile
- FR-2.3: The system shall allow staff to search donors by blood type, name, or contact
- FR-2.4: The system shall track donor eligibility based on screening results
- FR-2.5: The system shall record total donation count per donor

### FR-3: Appointment Management
- FR-3.1: The system shall allow donors to book appointments for donation
- FR-3.2: The system shall allow staff to schedule appointments on behalf of donors
- FR-3.3: The system shall prevent donors from scheduling if ineligible
- FR-3.4: The system shall track appointment status (SCHEDULED, COMPLETED, CANCELLED)
- FR-3.5: The system shall associate appointments with campaigns

### FR-4: Blood Inventory Management
- FR-4.1: The system shall track blood units by type (A+, A-, B+, B-, AB+, AB-, O+, O-)
- FR-4.2: The system shall record expiry dates for each blood unit
- FR-4.3: The system shall mark units as usable/unusable based on test results
- FR-4.4: The system shall alert when inventory falls below threshold
- FR-4.5: The system shall track inventory across multiple locations

### FR-5: Blood Processing
- FR-5.1: The system shall record donor screening data (hemoglobin, weight, temperature, blood pressure, pulse)
- FR-5.2: The system shall support screening deferral with reasons
- FR-5.3: The system shall record blood collection with unit numbers and bag IDs
- FR-5.4: The system shall track collection through testing and quarantine phases
- FR-5.5: The system shall record laboratory test results (ABO, Rh, HIV, HBV, HCV, Syphilis)

### FR-6: Blood Requests and Issuing
- FR-6.1: The system shall allow hospitals to request blood units
- FR-6.2: The system shall track request urgency levels (ROUTINE, URGENT, EMERGENCY)
- FR-6.3: The system shall match requests to available compatible units
- FR-6.4: The system shall record blood issuances to hospitals
- FR-6.5: The system shall track transfusion records including adverse reactions

### FR-7: Campaign Management
- FR-7.1: The system shall allow admins to create donation campaigns
- FR-7.2: The system shall track campaign dates, locations, and targets
- FR-7.3: The system shall count registered donors per campaign
- FR-7.4: The system shall mark campaigns as active/inactive

### FR-8: Reporting and Analytics
- FR-8.1: The system shall generate reports on donor statistics
- FR-8.2: The system shall generate inventory level reports
- FR-8.3: The system shall generate campaign participation reports
- FR-8.4: The system shall generate screening and testing summaries

### FR-9: Quality Control
- FR-9.1: The system shall log equipment temperature checks
- FR-9.2: The system shall record training completion for staff
- FR-9.3: The system shall track certification expiry dates

## Non-Functional Requirements

### NFR-1: Performance
- NFR-1.1: System shall support minimum 50 concurrent users
- NFR-1.2: Page load time shall not exceed 3 seconds under normal load
- NFR-1.3: Database queries shall return results within 1 second for 95% of operations

### NFR-2: Security
- NFR-2.1: All database connections shall use encrypted transmission
- NFR-2.2: Passwords shall be hashed using bcrypt or equivalent
- NFR-2.3: System shall implement input validation to prevent SQL injection
- NFR-2.4: System shall log all authentication attempts
- NFR-2.5: Sensitive operations shall require role-based authorization

### NFR-3: Usability
- NFR-3.1: System shall provide intuitive navigation with max 3 clicks to reach any feature
- NFR-3.2: System shall display error messages in clear, actionable language
- NFR-3.3: System shall support screen resolution of 1024x768 minimum

### NFR-4: Reliability
- NFR-4.1: System uptime shall be 99% during business hours
- NFR-4.2: Database backups shall be performed daily
- NFR-4.3: System shall handle database connection failures gracefully

### NFR-5: Maintainability
- NFR-5.1: Code shall follow layered architecture (DAO, Service, UI)
- NFR-5.2: System shall support configurable database connection parameters
- NFR-5.3: System shall log errors with sufficient detail for debugging

### NFR-6: Compatibility
- NFR-6.1: System shall run on Windows 10+ and Linux distributions
- NFR-6.2: System shall support MSSQL Server and MySQL databases
- NFR-6.3: System shall deploy via Docker with docker-compose

### NFR-7: Scalability
- NFR-7.1: Database design shall support up to 100,000 donor records
- NFR-7.2: System shall support multiple blood bank locations